package br.com.scheduler.services;

import br.com.scheduler.mapper.user.AddressMapper;
import br.com.scheduler.mapper.user.PhoneMapper;
import br.com.scheduler.mapper.user.UserMapper;
import br.com.scheduler.models.dto.user.UserCreatedDto;
import br.com.scheduler.models.dto.user.UserDto;
import br.com.scheduler.models.entity.user.User;
import br.com.scheduler.repositories.user.UserRepository;
import br.com.scheduler.services.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final PhoneMapper phoneMapper;
    private final AddressMapper addressMapper;
    private final UserRepository userRepository;

    @Override
    public UserDto createUserDto(UserCreatedDto userCreatedDto) {

        User newUser = userMapper.toUserCreatedDto(userCreatedDto);

        if (userCreatedDto.getAddresses() != null) {
            userCreatedDto.getAddresses()
                    .stream()
                    .map(addressMapper::toAddress)
                    .forEach(newUser::addAddress);
        }

        if (userCreatedDto.getPhones() != null) {
            userCreatedDto.getPhones()
                    .stream()
                    .map(phoneMapper::toPhone)
                    .forEach(newUser::addPhones);
        }
        User newUserSaved = userRepository.save(newUser);
        return userMapper.toUserDto(newUserSaved);
    }

    @Override
    public UserDto findByUser(Long id) {
        return userMapper.toUserDto(userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("Usuário não foi encontrado com esse id " + id)
        ));
    }

    public UserDto findAll(Pageable pageable){
        return (UserDto) userRepository.findAll(pageable);
    }
}

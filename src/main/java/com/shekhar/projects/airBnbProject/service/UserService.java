package com.shekhar.projects.airBnbProject.service;

import com.shekhar.projects.airBnbProject.Dto.*;
import com.shekhar.projects.airBnbProject.Entity.*;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}

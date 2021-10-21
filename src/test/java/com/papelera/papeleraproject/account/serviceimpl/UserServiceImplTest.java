package com.papelera.papeleraproject.account.serviceimpl;

import com.papelera.papeleraproject.account.service.module.UserModuleService;
import com.papelera.papeleraproject.configuration.enumerator.UserStatusEnum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;
    @Mock
    private UserModuleService userModuleService;

    @Test
    void contextLoads() {
    }

    @ParameterizedTest
    @EnumSource(UserStatusEnum.class)
    void contextLoads(UserStatusEnum us) {
        String status = this.userService.returnStatus(us);
        assertThat(status).isEqualTo(us.getDescription());
    }

}
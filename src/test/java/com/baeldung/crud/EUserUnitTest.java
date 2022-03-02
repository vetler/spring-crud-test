package com.baeldung.crud;

import static org.assertj.core.api.Assertions.assertThat;

import com.baeldung.crud.entities.EUser;
import org.junit.Test;

public class EUserUnitTest {
    
    @Test
    public void whenCalledGetName_thenCorrect() {
        EUser EUser = new EUser("Julie", "julie@domain.com");
        
        assertThat(EUser.getName()).isEqualTo("Julie");
    }
    
    @Test
    public void whenCalledGetEmail_thenCorrect() {
        EUser EUser = new EUser("Julie", "julie@domain.com");
        
        assertThat(EUser.getEmail()).isEqualTo("julie@domain.com");
    }
    
    @Test
    public void whenCalledSetName_thenCorrect() {
        EUser EUser = new EUser("Julie", "julie@domain.com");
        
        EUser.setName("John");
        
        assertThat(EUser.getName()).isEqualTo("John");
    }
    
    @Test
    public void whenCalledSetEmail_thenCorrect() {
        EUser EUser = new EUser("Julie", "julie@domain.com");
        
        EUser.setEmail("john@domain.com");
        
        assertThat(EUser.getEmail()).isEqualTo("john@domain.com");
    }
    
    @Test
    public void whenCalledtoString_thenCorrect() {
        EUser EUser = new EUser("Julie", "julie@domain.com");
        assertThat(EUser.toString()).isEqualTo("User{id=0, name=Julie, email=julie@domain.com}");
    }
}

package tech.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tech.springframework.model.Owner;
import tech.springframework.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    Set<Owner> owners;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        owners = new HashSet<>();
        Owner owner1 = new Owner();
        owner1.setFirstName("Kedar");
        owner1.setLastName("Erande");
        owner1.setId(1L);
        owners.add(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jack");
        owner2.setLastName("Master");
        owner2.setId(2L);
        owners.add(owner2);


        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();


    }


    @Test
    void listOwners() throws Exception {
        Mockito.when(ownerService.findAll()).thenReturn(owners);

        mockMvc.perform(get("/owners"))
                .andExpect(status().is(200))
                .andExpect(view().name("owners/owners"))
                .andExpect(model().attribute("owners", hasSize(2)));

    }

    @Test
    void findOwners() {

    }
}
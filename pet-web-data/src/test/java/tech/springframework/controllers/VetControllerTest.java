package tech.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import tech.springframework.model.Vet;
import tech.springframework.services.VetService;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

class VetControllerTest {

    @Mock
    private VetService vetService;

    @InjectMocks
    private VetController vetController;

    MockMvc mvc;

    Set<Vet> vet;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mvc= MockMvcBuilders.standaloneSetup(vetController).build();
        vet=new HashSet<>();
        Vet v1=new Vet();
        v1.setFirstName("Dob");
        v1.setLastName("Fok");
        v1.setId(1L);
        vet.add(v1);
    }

    @Test
    void listOfVets() throws Exception {

        Mockito.when(vetService.findAll()).thenReturn(vet);

        mvc.perform(get("/vets"))
                .andExpect(status().is(200))
                .andExpect(view().name("vets/vets"))
                .andExpect(model().attribute("vets",hasSize(1)));


    }
}
package com.imambux.petclinic.bootstrap;

import com.imambux.petclinic.map.OwnerServiceMap;
import com.imambux.petclinic.map.VetServiceMap;
import com.imambux.petclinic.model.Owner;
import com.imambux.petclinic.model.Vet;
import com.imambux.petclinic.service.OwnerService;
import com.imambux.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ali");
        vet2.setLastName("Imam");

        vetService.save(vet2);

        System.out.println("Vets loaded...");
    }

}

package edu.harvard.iq.dataverse_hub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.harvard.iq.dataverse_hub.model.Installation;
import edu.harvard.iq.dataverse_hub.repository.InstallationRepo;

@Service
public class InstallationService {

    @Autowired
    private InstallationRepo installationRepo;

    public Installation findByName(String name) {
        return installationRepo.findByName(name);
    }

}

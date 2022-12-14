package jordan.eldridge.helpdesksever.domain.helpRequest.service;

import jordan.eldridge.helpdesksever.domain.helpRequest.model.HelpRequest;
import jordan.eldridge.helpdesksever.domain.helpRequest.repo.HelpRequestRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HelpRequestServiceImpl implements HelpRequestService {



    private HelpRequestRepo repo;

    @Autowired
    public HelpRequestServiceImpl(HelpRequestRepo repo) {
        this.repo = repo;
    }

    @Override
    public HelpRequest create(HelpRequest helpRequest) {
        helpRequest = repo.save(helpRequest);
        log.info(helpRequest.toString());
        return helpRequest;
    }

    @Override
    public Iterable<HelpRequest> getAll() {
        return repo.findAll();
    }
}

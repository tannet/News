package com.epam.news.service.factory;

import com.epam.news.service.interfaces.ClientService;
import com.epam.news.service.impl.ClientServiceImpl;
import com.epam.news.service.interfaces.PortalService;
import com.epam.news.service.impl.PortalServiceImpl;

/**
 * Created by hannatarletskaya on 1/30/17.
 */

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ClientService clientService = new ClientServiceImpl();
    private final PortalService portalService = new PortalServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ClientService getCLientService() {
        return clientService;
    }

    public PortalService getLibraryService() {
        return portalService;
    }
}

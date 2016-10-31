package io.sls.core.runtime.client.bots;

import io.sls.core.runtime.IBot;
import io.sls.core.runtime.service.ServiceException;

/**
 * @author ginccc
 */
public interface IBotStoreClientLibrary {
    IBot getBot(String botId, Integer version) throws ServiceException, IllegalAccessException;
}
package ru.anvarzhonov.clientservice.services;

import ru.anvarzhonov.clientservice.entity.ClientEntity;

/**
 * todo Document type ClientService
 *
 * @author - Anvarzhonov Z.T. IKBO-20-19 on 12.12.2022 - 21:46
 */
public interface ClientService {
    ClientEntity searchClient(Integer clientId);
}

package com.jeanpandolfi.deliveryauthserver.repository;

import com.jeanpandolfi.deliveryauthserver.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String name);
}

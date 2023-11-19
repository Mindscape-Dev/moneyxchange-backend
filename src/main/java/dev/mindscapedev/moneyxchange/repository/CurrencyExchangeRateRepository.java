package dev.mindscapedev.moneyxchange.repository;

import dev.mindscapedev.moneyxchange.core.currency.model.CurrencyExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRateRepository extends JpaRepository<CurrencyExchangeRate, String> {
}

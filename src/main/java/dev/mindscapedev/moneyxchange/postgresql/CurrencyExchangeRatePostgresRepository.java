package dev.mindscapedev.moneyxchange.postgresql;

import dev.mindscapedev.moneyxchange.core.currency.model.CurrencyExchangeRate;
import dev.mindscapedev.moneyxchange.core.repository.CurrencyExchangeRateRepository;

public interface CurrencyExchangeRatePostgresRepository extends CurrencyExchangeRateRepository,JpaRepository<CurrencyExchangeRate,String> {
}

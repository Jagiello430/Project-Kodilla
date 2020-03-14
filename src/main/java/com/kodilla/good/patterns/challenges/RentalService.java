package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface RentalService {
    boolean rent(final User user, final LocalDateTime from, final LocalDateTime to);
}

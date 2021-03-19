package guru.springframework.sfgrestdocsexample.repositories;

import guru.springframework.sfgrestdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
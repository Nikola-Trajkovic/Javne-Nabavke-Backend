package rs.raf.ui2021.javnenabavkebackendfebruar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.raf.ui2021.javnenabavkebackendfebruar.model.StavkaJavneNabavke;
@Repository
public interface StavkaJavneNabavkeRepository  extends JpaRepository<StavkaJavneNabavke, Long> {
}

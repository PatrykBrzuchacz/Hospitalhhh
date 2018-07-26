package pl.softsystem.hospital.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer pesel;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private Set<PatientExamination> patientExaminations = new HashSet<>();

    public PatientExamination createPatientExamination() {
        PatientExamination patientExamination = new PatientExamination();
        patientExaminations.add(patientExamination);
        return patientExamination;
    }
}

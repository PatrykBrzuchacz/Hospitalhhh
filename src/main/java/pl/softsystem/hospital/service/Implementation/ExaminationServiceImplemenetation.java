package pl.softsystem.hospital.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.softsystem.hospital.model.Examination;
import pl.softsystem.hospital.model.ExaminationType;
import pl.softsystem.hospital.repository.ExaminationRepository;
import pl.softsystem.hospital.service.ExaminationService;

@Service
public class ExaminationServiceImplemenetation implements ExaminationService {

    @Autowired
    private ExaminationRepository examinationRepository;


    @Override
    public Examination saveExamination(Examination examination){
        return examinationRepository.save(examination);
    }

    @Override
    public Long getIdByType(ExaminationType examination) {
        return null;
    }


<<<<<<< HEAD
/*
public Examination getIdByType(Examination examination){
return examinationRepository.getIdByType(examination);
}
*/

    public Long getIdByType(Examination examination){
        return examinationRepository.getIdByType(examination);
}
=======
    @Override
    public Examination findById(Long id) {
        return examinationRepository.findById(id).get();
    }


>>>>>>> feb90f9ffe3bf80c055060c954b3fc19606785a4



}

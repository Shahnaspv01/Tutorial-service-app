//package com.example.demo.service;
//
//import com.example.demo.model.Tutorial;
//import com.example.demo.repo.TutorialRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//@Service
//public class TutorialServiceImpl implements TutorialService {
//    private TutorialRepository tutorialRepository;
//
//    @Autowired
//    public TutorialServiceImpl(TutorialRepository tutorialRepository) {
//        this.tutorialRepository = tutorialRepository;
//    }
//
//    @Override
//    public List<Tutorial> getAll() {
//        return tutorialRepository.findAll();
//    }
//    @Override
//    @Transactional
//    public Tutorial createTutorial(Tutorial tutorial) {
//        return tutorialRepository.save(tutorial);
//    }
//}

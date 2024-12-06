package tn.esprit.sleam.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ConfigAOP {
//    @Before("execution(* tn.esprit.sleam.service..*.*(..))")
//    @After("execution(* tn.esprit.sleam.service.interafce.IUserService.ajouterUser())")
//    @AfterReturning("execution(* tn.esprit.sleam.service.interafce.IUserService.ajouterUser())")
    @AfterThrowing("execution(* tn.esprit.sleam.service.interafce.IUserService.ajouterUser())")
    void treaceAspect(JoinPoint joinPoint){
        log.info("In method : " + joinPoint.getSignature().getName());
    }
}

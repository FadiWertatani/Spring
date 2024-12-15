package tn.esprit.sleam.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

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

    @Around("execution(* tn.esprit.sleam.service..*.*(..))")
    Object calculerTempsExecution(ProceedingJoinPoint pjp) throws Throwable {
        LocalDateTime debut = LocalDateTime.now();
        Object object = pjp.proceed();   //Definit l'instant de l'execution
        LocalDateTime fin = LocalDateTime.now();
        long duree = Duration.between(debut, fin).toMillis();
        log.info("le temps d'exucution de la methode " + pjp.getSignature().getName() + " est: " + duree + " ms");
        return null;
    }
}

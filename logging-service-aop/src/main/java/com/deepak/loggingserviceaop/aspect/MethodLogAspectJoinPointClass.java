package com.deepak.loggingserviceaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Aspect
@Component
@ComponentScan("com.deepak.loggingserviceaop.aspect")
public class MethodLogAspectJoinPointClass {

    @Around("@annotation(MethodTimeCalcAspect)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("**********8logExecutionTime$$$$$$$$$$$$$$$$$$$$$$$");
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }

   /*@Before("execution ( * com.deepak..*.*(..))")
   public void allMethodsWithoutAnnotation() {
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*allMethodsWithoutAnnotation");
   }*/

   /* @Before("execution ( * com.deepak.loggingclientaop..*.*(..))")
    public void allMethodsWithoutAnnotation() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*allMethodsWithoutAnnotation");
    }*/
  /* @Pointcut("bean(*Controller)")
    public void allControllers(){
       System.out.println("**********all Contollers");
   }

   @Before("allControllers()")
   public void allContollersBefore(){
       System.out.println("@@@@@@@@@@@@@@@@@ loggingOperation");
   }

    @Pointcut("execution(* com.deepak..controller..*(..))")
    protected void subPackagesLogging()
    {
        System.out.println("````````````````````````````subPackages");
    }

    @Before("subPackagesLogging()")
    public void subPackagesLoggingBefore(){
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&subpackages loggng");
    }

*/


}

package services;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogger {
	
	@After("execution(* get*(..))")
	public void logAfterget(){
		System.out.println(" Appel apres un get ");
	}

	
	@Before("execution(* *(..))")
	public void logName(JoinPoint joinPoint){
		System.out.println(" Name methode : " +joinPoint.getSignature().getName());
	}
	
	@AfterThrowing(throwing= "ex" ,pointcut="execution(* *.*(..))")
	public void logException(){
		System.out.println(" Exception trouvé ");
	}
	
	
	@Around("execution(* save(..))")
	public Object logSave(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println(" Appel avant PJP ");
		Object returnedValue = pjp.proceed();
		System.out.println("Appel apres PJP");
		return returnedValue;
	}
}
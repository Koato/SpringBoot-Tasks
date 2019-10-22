package gomez.andy.demospringboot.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Tasks {
	@Scheduled(fixedRate = 5000)
	public void logCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		log.info("Hora actual: " + dateFormat.format(new Date()));
	}
}

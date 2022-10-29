package pdev.consumer.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import pdev.consumer.rabbitmq.domain.NotaFiscalRequest;

@Slf4j
@Component
public class NotaFiscalConsumer {

    public static final String QUEUE_NAME = "pdev.nf.queue";

    @RabbitListener(queues = QUEUE_NAME)
    public void listener(Message message, NotaFiscalRequest request) {
        log.info("Mensagem recebida: {}", request);
    }
}

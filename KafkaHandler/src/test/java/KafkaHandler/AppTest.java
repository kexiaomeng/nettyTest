//package KafkaHandler;
//
//import static org.junit.Assert.assertTrue;
//
//import org.junit.Test;
//
//import com.nari.kafka.common.KafkaFactory;
//import com.nari.kafka.consumer.KafkaConsumer;
//import com.nari.kafka.handler.impl.TestHandler;
//
///**
// * Unit test for simple App.
// */
//public class AppTest 
//{
//    /**
//     * Rigorous Test :-)
//     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//    	KafkaConsumer consumer = KafkaFactory.getKafkaConsumer("test",TestHandler.class);
//		consumer.consumerMess();
////		KafkaFactory.getKafkaConsumer("hello").consumerMess();
//		
//		  int sleepMillis = 10000;
//	        try {
//	            Thread.sleep(sleepMillis);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//	        
//	        consumer.shutdown();
//    }
//}

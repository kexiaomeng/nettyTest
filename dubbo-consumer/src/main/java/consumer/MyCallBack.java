package consumer;

import java.util.HashMap;
import java.util.Map;

public interface MyCallBack {

    Map<String, CallBack> callBackMap = new HashMap<>();
    interface CallBack{
        public void callBack();
    }
}

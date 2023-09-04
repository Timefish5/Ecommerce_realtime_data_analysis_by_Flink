package behavior;


import org.apache.flink.streaming.api.functions.windowing.WindowFunction;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;

public class WindowResult implements WindowFunction<Long, ItemViewCount, Long, TimeWindow>{


    /**
     * Evaluates the window and outputs none or several elements.
     *
     * @param key  The key for which this window is evaluated.
     * @param timeWindow The window that is being evaluated.
     * @param iterable  The elements in the window being evaluated.
     * @param collector    A collector for emitting elements.
     * @throws Exception The function may throw exceptions to fail the program and trigger recovery.
     */
    @Override
    public void apply(Long key, TimeWindow timeWindow, Iterable<Long> iterable, Collector<ItemViewCount> collector) throws Exception {
        collector.collect(new ItemViewCount(key, timeWindow.getEnd(), iterable.iterator().next()));
    }
}

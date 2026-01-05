import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

// DemoLambdaSample: 多個簡潔的 Lambda 範例，每個範例旁邊都有中文註解
public class DemoLambdaSample {
	public static void main(String[] args) throws Exception {
		// 範例 1：Stream 處理
		// 說明：使用 lambda 做過濾(filter)與轉換(map)，最後以 method reference 列印
		List<String> names = Arrays.asList("john", "mary", "peter", "anna");
		System.out.println("Stream filter+map:");
		names.stream()
				// 只保留長度大於 3 的字串
				.filter(s -> s.length() > 3)
				// 把字串轉大寫（使用方法參考更簡潔）
				.map(String::toUpperCase)
				// 逐一列印（方法參考）
				.forEach(System.out::println);

		// 範例 2：CompletableFuture 非同步鏈
		// 說明：示範如何用 lambda 串接非同步任務、轉換結果並消費結果
		System.out.println("\nCompletableFuture chain:");
		CompletableFuture<Void> cf = CompletableFuture.supplyAsync(() -> {
			// 模擬耗時工作
			sleep(150);
			return 21; // 傳回初始值
		})
		// 將返回值乘 2
		.thenApply(x -> x * 2)
		// 消費結果（印出）
		.thenAccept(x -> System.out.println("Result = " + x));
		// 等待完成以便範例同步輸出（demo 用）
		cf.get();

		// 範例 3：Map.computeIfAbsent 與 forEach
		// 說明：在 map 中若鍵不存在則建立預設值，常見於群組或緩存邏輯
		System.out.println("\nMap computeIfAbsent:");
		Map<Integer, List<String>> map = new HashMap<>();
		// 若 key 1 不存在，建立一個新的 ArrayList
		map.computeIfAbsent(1, k -> new ArrayList<>()).add("Alice");
		map.computeIfAbsent(2, k -> new ArrayList<>()).add("Bob");
		// 使用 lambda 列印 map 內容
		map.forEach((k, v) -> System.out.println(k + " -> " + v));

		// 範例 4：Supplier 產生 1..49 的隨機數（類似六合彩）
		// 說明：Supplier 無輸入但有回傳值，常用於延遲取得或懶初始化
		System.out.println("\nRandom 1-49 (6 numbers):");
		Supplier<Integer> markSixGenerator = () -> new Random().nextInt(49) + 1;
		for (int i = 0; i < 6; i++) {
			System.out.print(markSixGenerator.get());
			if (i < 5) System.out.print(", ");
		}
		System.out.println();
	}

	// 小工具：睡眠方法，用於模擬非同步作業的耗時
	private static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}

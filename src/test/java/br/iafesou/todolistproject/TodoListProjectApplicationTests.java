package br.iafesou.todolistproject;

import br.iafesou.todolistproject.model.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoListProjectApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTaskSuccess() {
		var taskBody = new Task("first task", "some description", false, 2);

		webTestClient.post().uri("/api/tasks").bodyValue(taskBody).exchange().expectStatus().isOk().expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("[0].name").isEqualTo(taskBody.getName())
				.jsonPath("[0].description").isEqualTo(taskBody.getDescription())
				.jsonPath("[0].done").isEqualTo(taskBody.isDone())
				.jsonPath("[0].priority").isEqualTo(taskBody.getPriority());
	}
	@Test
	void testCreateTaskError() {

	}


	@Test
	void testDeleteTaskSuccess() {

	}
	@Test
	void testDeleteTaskError() {

	}
}

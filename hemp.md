Run Integration test only if unit tests work fine. Heavy
failsafeplugin to run Interation test with goal verify
surefire plugin to test unit tests

MVC tests are intended to cover just the controller piece of your application. HTTP requests and responses are mocked so the real connections are not created. On the other hand, when you use @SpringBootTest, all the configuration for the web application context is loaded and the connections are going through the real web server. In that case, you don’t use the MockMvc bean but a standard RestTemplate instead (or the new alternative TestRestTemplate).
So, when should we choose one or the other? @WebMvcTest is intended to test unitarily the controller from the server side. @SpringBootTest, on the other hand, should be used for integration tests, when you want to interact with the application from the client side.
That doesn’t mean that you can’t use mocks with @SpringBootTest; if you’re writing an integration test, that could still be necessary. In any case, it’s better not to use it just for a simple controller’s unit test.
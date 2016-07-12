package javaquick.programs;

import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.http.Fault;

/**
 * Wiremock Utilities *
 */
public class MockServer {
	private static final String GOOD_RESPONSE = "\"glossary\":{\"title\":\"example glossary\",\"GlossDiv\":{\"title\":\"S\",\"GlossList\":{\"GlossEntry\":{\"ID\":\"SGML\",\"SortAs\":\"SGML\",\"GlossTerm\":\"Standard Generalized Markup Language\",\"Acronym\":\"SGML\",\"Abbrev\":\"ISO 8879:1986\",\"GlossDef\":{\"para\":\"A meta-markup language, used to create markup languages such as DocBook.\",\"GlossSeeAlso\":[\"GML\",\"XML\"]},\"GlossSee\":\"markup\"}}}}}";

	public void startWiremock(int port) {
		WireMockServer wireMockServer = null;
		try {
			wireMockServer = new WireMockServer(wireMockConfig().port(port));
			configureFor("locahhost", port);
			wireMockServer.start();

			//
			stubFor(get(urlEqualTo("/get/get200StatusCode"))
					.willReturn(aResponse().withStatus(200).withBody(GOOD_RESPONSE)));
			stubFor(get(urlEqualTo("/get/get500StatusCode")).willReturn(
					aResponse().withStatus(500).withBody("Service is Temporarily down")));
			stubFor(get(urlEqualTo("/get/get400StatusCode"))
					.willReturn(aResponse().withStatus(400).withBody("Bad Request")));
			stubFor(get(urlEqualTo("/get/get400FixedDelay")).willReturn(
					aResponse().withStatus(400).withFixedDelay(3000).withBody("Bad Request")));
			stubFor(get(urlEqualTo("/get/get500FixedDelay")).willReturn(aResponse().withStatus(500)
					.withFixedDelay(3000).withBody("Service is Temporarily down")));
			stubFor(get(urlEqualTo("/get/get200FaultResponse"))
					.willReturn(aResponse().withStatus(200).withFixedDelay(2000)
							.withFault(Fault.MALFORMED_RESPONSE_CHUNK).withBody(GOOD_RESPONSE)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

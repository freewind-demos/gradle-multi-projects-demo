package my;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class HelloSpec {

    @Test
    public void shouldSayHello() throws Exception {
        String greeting = new HelloRoot().hello("gradle");
        assertThat(greeting).isEqualTo("Hello, gradle");
    }

}

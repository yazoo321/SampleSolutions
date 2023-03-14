package samples.hackerrank.basic_prep.sock_merchant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SockMerchantTest {

    SockMerchant sockMerchant = new SockMerchant();

    @Test
    void whenGivingSomeSocksAndExpecting3Pairs() {
        // given
        int n = 9;
        List<Integer> socks = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        // when
        int actual = SockMerchant.sockMerchant(n, socks);

        // then
        Assertions.assertThat(actual).isEqualTo(3);
    }
}

package collections.fold

import org.junit.Assert
import org.junit.Test
import koans.util.toMessage
import collections.*

class TestFold {
    @Test fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'",
                customer(lucas, Canberra,
                        order(idea),
                        order(webStorm)
                ),
                customer(reka, Budapest,
                        order(idea),
                        order(youTrack)
                )
        )
        Assert.assertEquals("getSetOfProductsOrderedByEveryCustomer".toMessage(),
                setOf(idea), testShop.getSetOfProductsOrderedByEveryCustomer())

    }
}

package cash.z.ecc.android.sdk.darkside.reorgs

import androidx.test.ext.junit.runners.AndroidJUnit4
import cash.z.ecc.android.sdk.ext.toHex
import cash.z.ecc.android.sdk.darkside.test.DarksideTestCoordinator
import cash.z.ecc.android.sdk.darkside.test.ScopedTest
import cash.z.ecc.android.sdk.darkside.test.SimpleMnemonics
import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SetupTest : ScopedTest() {

//    @Test
//    fun testFirstBlockExists() {
//        validator.validateHasBlock(
//            firstBlock
//        )
//    }
//
//    @Test
//    fun testLastBlockExists() {
//        validator.validateHasBlock(
//            lastBlock
//        )
//    }
//
//    @Test
//    fun testLastBlockHash() {
//        validator.validateBlockHash(
//            lastBlock,
//            lastBlockHash
//        )
//    }

    @Test
    @Ignore("This test is broken")
    fun tempTest() {
        val phrase = "still champion voice habit trend flight survey between bitter process artefact blind carbon truly provide dizzy crush flush breeze blouse charge solid fish spread"
        val result = SimpleMnemonics().toSeed(phrase.toCharArray()).toHex()
        assertEquals("abc", result)
    }

    @Test
    @Ignore("This test is broken")
    fun tempTest2() {
        val s = SimpleMnemonics()
        val ent = s.nextEntropy()
        val phrase = s.nextMnemonic(ent)

        assertEquals("a", "${ent.toHex()}|${String(phrase)}")
    }

    companion object {
        private const val blocksUrl = "https://raw.githubusercontent.com/zcash-hackworks/darksidewalletd-test-data/master/basic-reorg/before-reorg.txt"
        private const val firstBlock = 663150
        private const val lastBlock = 663200
        private const val lastBlockHash = "2fc7b4682f5ba6ba6f86e170b40f0aa9302e1d3becb2a6ee0db611ff87835e4a"
        private val sithLord = DarksideTestCoordinator()
        private val validator = sithLord.validator

//        @BeforeClass
//        @JvmStatic
//        fun startAllTests() {
//            sithLord
//                .enterTheDarkside()
//                    // TODO: fix this
// //                .resetBlocks(blocksUrl, startHeight = firstBlock, tipHeight = lastBlock)
//                .startSync(classScope)
//                .await()
//        }
    }
}

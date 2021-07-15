package cash.z.ecc.android.sdk.demoapp

data class DemoConfig(
    val alias: String = "SdkDemo",
    val host: String = "lightd.pirate.black",
    val port: Int = 443,
    val birthdayHeight: Int = 1390000,
    val utxoEndHeight: Int = 1476903,
    val sendAmount: Double = 0.000018,

    // corresponds to address: zs15tzaulx5weua5c7l47l4pku2pw9fzwvvnsp4y80jdpul0y3nwn5zp7tmkcclqaca3mdjqjkl7hx
    val initialSeedWords: String = "eyebrow luggage boy enemy stamp lunch middle slab mother bacon confirm again tourist idea grain pink angle comic question rabbit pole train dragon grape",

    // corresponds to seed: 
    val toAddress: String = "zs163xv6jsmpuyrlzr58glzv9aetepcyss5n3pqg9gqzahf5aghd65za99zult82dxmx2qsjswxumj"
) 
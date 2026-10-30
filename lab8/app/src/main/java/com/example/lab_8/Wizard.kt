package com.example.lab_8

class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3 // 10*3 = 30
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2 // 10*2 = 20
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }

    fun restoreMana(amount: Int){
        mana = minOf(100, mana + amount)
    }
}
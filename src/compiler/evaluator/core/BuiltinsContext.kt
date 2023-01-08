package compiler.evaluator.core

import compiler.evaluator.builtins.constants.PyNone
import compiler.evaluator.builtins.constants.PyNotImplemented
import compiler.evaluator.builtins.functions.PyAppend
import compiler.evaluator.builtins.functions.PyPrint
import compiler.evaluator.builtins.functions.PyRange
import compiler.evaluator.builtins.types.PyBool

val builtins = hashMapOf(
    // Constants
    "None" to PyNone,
    "NotImplemented" to PyNotImplemented,
    "True" to PyBool.of(true),
    "False" to PyBool.of(false),
    // Functions
    "print" to PyPrint,
    "range" to PyRange,
    "append" to PyAppend,
)

val builtinsScope = Scope(null, builtins.keys.toList())

class BuiltinsContext : Context(builtinsScope) {
    init {
        builtins.forEach{ (name, value) -> setVariable(name, value)}
    }
}
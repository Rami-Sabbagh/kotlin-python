package evaluator.calculator_05.source_tree.statements.expressions

import evaluator.calculator_05.core.Context
import evaluator.calculator_05.builtins.types.PyFloat
import evaluator.calculator_05.builtins.types.PyString
import evaluator.calculator_05.core.PyObject

class Literal (
    value: Any
) : Expression() {
    private val pyValue: PyObject = when (value) {
        is Float -> PyFloat.of(value.toDouble())
        is Double -> PyFloat.of(value)
        is String -> PyString(value)
        is PyObject -> value
        else -> error("Unsupported literal value type: ${value.javaClass.canonicalName}")
    }

    override fun evaluate(context: Context) = pyValue
}
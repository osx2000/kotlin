// !WITH_NEW_INFERENCE
// !DIAGNOSTICS: -UNREACHABLE_CODE

fun foo() {
    val <!OI;UNUSED_VARIABLE!>text<!>: List<Any> = null!!
    text.<!UNRESOLVED_REFERENCE!>map<!> <!DEBUG_INFO_ELEMENT_WITH_ERROR_TYPE!>Any<!><!SYNTAX!>?<!>::<!DEBUG_INFO_MISSING_UNRESOLVED!>toString<!>
}

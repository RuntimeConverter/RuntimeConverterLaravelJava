package com.project.convertedCode.includes.resources.lang.en;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 resources/lang/en/validation.php

*/

public class file_validation_php implements RuntimeIncludable {

    public static final file_validation_php instance = new file_validation_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope222 scope = new Scope222();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope222 scope)
            throws IncludeEventException {
        throw new IncludeEventException(
                ZVal.assign(
                        ZVal.newArray(
                                new ZPair("accepted", "The :attribute must be accepted."),
                                new ZPair("active_url", "The :attribute is not a valid URL."),
                                new ZPair("after", "The :attribute must be a date after :date."),
                                new ZPair(
                                        "after_or_equal",
                                        "The :attribute must be a date after or equal to :date."),
                                new ZPair("alpha", "The :attribute may only contain letters."),
                                new ZPair(
                                        "alpha_dash",
                                        "The :attribute may only contain letters, numbers, dashes and underscores."),
                                new ZPair(
                                        "alpha_num",
                                        "The :attribute may only contain letters and numbers."),
                                new ZPair("array", "The :attribute must be an array."),
                                new ZPair("before", "The :attribute must be a date before :date."),
                                new ZPair(
                                        "before_or_equal",
                                        "The :attribute must be a date before or equal to :date."),
                                new ZPair(
                                        "between",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute must be between :min and :max."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be between :min and :max kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be between :min and :max characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must have between :min and :max items."))),
                                new ZPair("boolean", "The :attribute field must be true or false."),
                                new ZPair(
                                        "confirmed", "The :attribute confirmation does not match."),
                                new ZPair("date", "The :attribute is not a valid date."),
                                new ZPair(
                                        "date_format",
                                        "The :attribute does not match the format :format."),
                                new ZPair(
                                        "different",
                                        "The :attribute and :other must be different."),
                                new ZPair("digits", "The :attribute must be :digits digits."),
                                new ZPair(
                                        "digits_between",
                                        "The :attribute must be between :min and :max digits."),
                                new ZPair(
                                        "dimensions",
                                        "The :attribute has invalid image dimensions."),
                                new ZPair(
                                        "distinct", "The :attribute field has a duplicate value."),
                                new ZPair("email", "The :attribute must be a valid email address."),
                                new ZPair("exists", "The selected :attribute is invalid."),
                                new ZPair("file", "The :attribute must be a file."),
                                new ZPair("filled", "The :attribute field must have a value."),
                                new ZPair(
                                        "gt",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute must be greater than :value."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be greater than :value kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be greater than :value characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must have more than :value items."))),
                                new ZPair(
                                        "gte",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute must be greater than or equal :value."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be greater than or equal :value kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be greater than or equal :value characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must have :value items or more."))),
                                new ZPair("image", "The :attribute must be an image."),
                                new ZPair("in", "The selected :attribute is invalid."),
                                new ZPair(
                                        "in_array",
                                        "The :attribute field does not exist in :other."),
                                new ZPair("integer", "The :attribute must be an integer."),
                                new ZPair("ip", "The :attribute must be a valid IP address."),
                                new ZPair("ipv4", "The :attribute must be a valid IPv4 address."),
                                new ZPair("ipv6", "The :attribute must be a valid IPv6 address."),
                                new ZPair("json", "The :attribute must be a valid JSON string."),
                                new ZPair(
                                        "lt",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute must be less than :value."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be less than :value kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be less than :value characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must have less than :value items."))),
                                new ZPair(
                                        "lte",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute must be less than or equal :value."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be less than or equal :value kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be less than or equal :value characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must not have more than :value items."))),
                                new ZPair(
                                        "max",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute may not be greater than :max."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute may not be greater than :max kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute may not be greater than :max characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute may not have more than :max items."))),
                                new ZPair(
                                        "mimes", "The :attribute must be a file of type: :values."),
                                new ZPair(
                                        "mimetypes",
                                        "The :attribute must be a file of type: :values."),
                                new ZPair(
                                        "min",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric",
                                                        "The :attribute must be at least :min."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be at least :min kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be at least :min characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must have at least :min items."))),
                                new ZPair("not_in", "The selected :attribute is invalid."),
                                new ZPair("not_regex", "The :attribute format is invalid."),
                                new ZPair("numeric", "The :attribute must be a number."),
                                new ZPair("present", "The :attribute field must be present."),
                                new ZPair("regex", "The :attribute format is invalid."),
                                new ZPair("required", "The :attribute field is required."),
                                new ZPair(
                                        "required_if",
                                        "The :attribute field is required when :other is :value."),
                                new ZPair(
                                        "required_unless",
                                        "The :attribute field is required unless :other is in :values."),
                                new ZPair(
                                        "required_with",
                                        "The :attribute field is required when :values is present."),
                                new ZPair(
                                        "required_with_all",
                                        "The :attribute field is required when :values is present."),
                                new ZPair(
                                        "required_without",
                                        "The :attribute field is required when :values is not present."),
                                new ZPair(
                                        "required_without_all",
                                        "The :attribute field is required when none of :values are present."),
                                new ZPair("same", "The :attribute and :other must match."),
                                new ZPair(
                                        "size",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "numeric", "The :attribute must be :size."),
                                                new ZPair(
                                                        "file",
                                                        "The :attribute must be :size kilobytes."),
                                                new ZPair(
                                                        "string",
                                                        "The :attribute must be :size characters."),
                                                new ZPair(
                                                        "array",
                                                        "The :attribute must contain :size items."))),
                                new ZPair("string", "The :attribute must be a string."),
                                new ZPair("timezone", "The :attribute must be a valid zone."),
                                new ZPair("unique", "The :attribute has already been taken."),
                                new ZPair("uploaded", "The :attribute failed to upload."),
                                new ZPair("url", "The :attribute format is invalid."),
                                new ZPair(
                                        "custom",
                                        ZVal.newArray(
                                                new ZPair(
                                                        "attribute-name",
                                                        ZVal.newArray(
                                                                new ZPair(
                                                                        "rule-name",
                                                                        "custom-message"))))),
                                new ZPair("attributes", ZVal.newArray()))));
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/resources/lang/en")
                    .setFile("/resources/lang/en/validation.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope222 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}

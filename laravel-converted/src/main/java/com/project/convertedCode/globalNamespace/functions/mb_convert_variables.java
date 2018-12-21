package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import com.runtimeconverter.runtime.functions.FunctionBaseExtended;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Mbstring.classes.Mbstring;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-mbstring/bootstrap.php

*/

public class mb_convert_variables extends FunctionBaseExtended {

    public static mb_convert_variables f = new mb_convert_variables();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "toEncoding")
    @ConvertedParameter(index = 1, name = "fromEncoding")
    @ConvertedParameter(index = 2, name = "a", defaultValue = "NULL", defaultValueType = "constant")
    @ConvertedParameter(index = 3, name = "b", defaultValue = "NULL", defaultValueType = "constant")
    @ConvertedParameter(index = 4, name = "c", defaultValue = "NULL", defaultValueType = "constant")
    @ConvertedParameter(index = 5, name = "d", defaultValue = "NULL", defaultValueType = "constant")
    @ConvertedParameter(index = 6, name = "e", defaultValue = "NULL", defaultValueType = "constant")
    @ConvertedParameter(index = 7, name = "f", defaultValue = "NULL", defaultValueType = "constant")
    public Object call(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        Object toEncoding = assignParameter(args, 0, false);
        Object fromEncoding = assignParameter(args, 1, false);
        ReferenceContainer a = assignParameterRef(runtimePassByReferenceArgs, args, 2, true);
        if (null == a.getObject()) {
            a.setObject(ZVal.getNull());
        }
        ReferenceContainer b = assignParameterRef(runtimePassByReferenceArgs, args, 3, true);
        if (null == b.getObject()) {
            b.setObject(ZVal.getNull());
        }
        ReferenceContainer c = assignParameterRef(runtimePassByReferenceArgs, args, 4, true);
        if (null == c.getObject()) {
            c.setObject(ZVal.getNull());
        }
        ReferenceContainer d = assignParameterRef(runtimePassByReferenceArgs, args, 5, true);
        if (null == d.getObject()) {
            d.setObject(ZVal.getNull());
        }
        ReferenceContainer e = assignParameterRef(runtimePassByReferenceArgs, args, 6, true);
        if (null == e.getObject()) {
            e.setObject(ZVal.getNull());
        }
        ReferenceContainer f = assignParameterRef(runtimePassByReferenceArgs, args, 7, true);
        if (null == f.getObject()) {
            f.setObject(ZVal.getNull());
        }
        return ZVal.assign(
                Mbstring.runtimeStaticObject.mb_convert_variables(
                        env,
                        new RuntimeArgsWithReferences()
                                .add(2, a)
                                .add(3, b)
                                .add(4, c)
                                .add(5, d)
                                .add(6, e)
                                .add(7, f),
                        toEncoding,
                        fromEncoding,
                        a.getObject(),
                        b.getObject(),
                        c.getObject(),
                        d.getObject(),
                        e.getObject(),
                        f.getObject()));
    }

    public Object mb_convert_variables(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-mbstring")
                .setFile("/vendor/symfony/polyfill-mbstring/bootstrap.php");
    }
}

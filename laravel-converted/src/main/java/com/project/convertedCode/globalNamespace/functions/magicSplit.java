package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/grammar/rebuildParsers.php

*/

public class magicSplit extends FunctionBaseRegular {

    public static magicSplit f = new magicSplit();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "regex")
    @ConvertedParameter(index = 1, name = "string")
    public Object call(RuntimeEnv env, Object... args) {
        Object regex = assignParameter(args, 0, false);
        Object string = assignParameter(args, 1, false);
        Object pieces = null;
        ReferenceContainer piece = new BasicReferenceContainer(null);
        pieces =
                NamespaceGlobal.preg_split
                        .env(env)
                        .call(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .functions
                                        .regex
                                        .f
                                        .env(env)
                                        .call(
                                                "(?:(?&string)|(?&comment)|(?&code))(*SKIP)(*FAIL)|"
                                                        + toStringR(regex, env))
                                        .value(),
                                string)
                        .value();
        for (ZPair zpairResult839 : ZVal.getIterable(pieces, env, true)) {
            piece = zpairResult839;
            piece.setObject(function_trim.f.env(env).call(piece.getObject()).value());
        }

        if (ZVal.strictEqualityCheck(pieces, "===", ZVal.arrayFromList(""))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(pieces);
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/nikic/php-parser/grammar")
                .setFile("/vendor/nikic/php-parser/grammar/rebuildParsers.php");
    }
}

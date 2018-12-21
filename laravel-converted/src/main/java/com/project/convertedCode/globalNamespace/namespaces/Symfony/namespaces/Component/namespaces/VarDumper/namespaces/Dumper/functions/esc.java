package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.VarDumper.namespaces.Dumper.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/var-dumper/Dumper/HtmlDumper.php

*/

public class esc extends FunctionBaseRegular {

    public static esc f = new esc();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "str")
    public Object call(RuntimeEnv env, Object... args) {
        Object str = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.htmlspecialchars.env(env).call(str, 3, "UTF-8").value());
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/var-dumper/Dumper")
                .setFile("/vendor/symfony/var-dumper/Dumper/HtmlDumper.php");
    }
}

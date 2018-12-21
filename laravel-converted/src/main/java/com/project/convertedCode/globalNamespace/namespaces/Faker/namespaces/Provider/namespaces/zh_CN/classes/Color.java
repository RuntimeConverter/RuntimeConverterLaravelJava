package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.zh_CN.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Color.php

*/

public class Color
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Color {

    public Color(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Color.class) {
            this.__construct(env, args);
        }
    }

    public Color(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\zh_CN\\Color";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Color
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object safeColorNames =
                ZVal.arrayFromList(
                        "\u9ED1\u8272",
                        "\u7C9F\u8272",
                        "\u7EFF\u8272",
                        "\u85CF\u9752",
                        "\u6A44\u6984\u8272",
                        "\u7D2B",
                        "\u51EB\u7EFF",
                        "\u9C9C\u7EFF\u8272",
                        "\u84DD\u8272",
                        "\u94F6\u8272",
                        "\u7070\u8272",
                        "\u9EC4\u8272",
                        "\u54C1\u7EA2",
                        "\u6C34\u8272",
                        "\u767D\u8272");

        public Object allColorNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u9ED1\u8272",
                                    "\u660F\u7070",
                                    "\u7070\u8272",
                                    "\u6697\u7070",
                                    "\u94F6\u8272",
                                    "\u4EAE\u7070\u8272",
                                    "\u5E9A\u65AF\u535A\u7F57\u7070",
                                    "\u767D\u70DF\u8272",
                                    "\u767D\u8272",
                                    "\u96EA\u8272",
                                    "\u94C1\u7070\u8272",
                                    "\u6C99\u68D5",
                                    "\u73AB\u7470\u8910",
                                    "\u4EAE\u73CA\u745A\u8272",
                                    "\u5370\u5EA6\u7EA2",
                                    "\u8910\u8272",
                                    "\u8010\u706B\u7816\u7EA2",
                                    "\u6817\u8272",
                                    "\u6697\u7EA2",
                                    "\u9C9C\u7EA2",
                                    "\u7EA2\u8272",
                                    "\u67FF\u5B50\u6A59",
                                    "\u96FE\u73AB\u7470\u8272",
                                    "\u9C91\u7EA2",
                                    "\u8165\u7EA2",
                                    "\u8543\u8304\u7EA2",
                                    "\u6697\u9C91\u7EA2",
                                    "\u73CA\u745A\u7EA2",
                                    "\u6A59\u7EA2",
                                    "\u4EAE\u9C91\u7EA2",
                                    "\u6731\u7EA2",
                                    "\u8D6D\u9EC4",
                                    "\u70ED\u5E26\u6A59",
                                    "\u9A7C\u8272",
                                    "\u674F\u9EC4",
                                    "\u6930\u8910",
                                    "\u6D77\u8D1D\u8272",
                                    "\u978D\u8910",
                                    "\u5DE7\u514B\u529B\u8272",
                                    "\u71C3\u6A59",
                                    "\u9633\u6A59",
                                    "\u7C89\u6251\u6843\u8272",
                                    "\u6C99\u8910",
                                    "\u53E4\u94DC\u8272",
                                    "\u4E9A\u9EBB\u8272",
                                    "\u871C\u6A59",
                                    "\u79D8\u9C81\u8272",
                                    "\u4E4C\u8D3C\u58A8\u8272",
                                    "\u8D6D\u8272",
                                    "\u9676\u576F\u9EC4",
                                    "\u6A58\u8272",
                                    "\u6697\u6A59",
                                    "\u53E4\u8463\u767D",
                                    "\u65E5\u6652\u8272",
                                    "\u786C\u6728\u8272",
                                    "\u674F\u4EC1\u767D",
                                    "\u90A3\u74E6\u970D\u767D",
                                    "\u4E07\u5BFF\u83CA\u9EC4",
                                    "\u8543\u6728\u74DC\u8272",
                                    "\u7070\u571F\u8272",
                                    "\u5361\u5176\u8272",
                                    "\u9E7F\u76AE\u978B\u8272",
                                    "\u65E7\u857E\u4E1D\u8272",
                                    "\u5C0F\u9EA6\u8272",
                                    "\u6843\u8272",
                                    "\u6A59\u8272",
                                    "\u82B1\u5349\u767D",
                                    "\u91D1\u83CA\u8272",
                                    "\u6697\u91D1\u83CA\u8272",
                                    "\u5496\u5561\u8272",
                                    "\u8309\u8389\u9EC4",
                                    "\u7425\u73C0\u8272",
                                    "\u7389\u7C73\u4E1D\u8272",
                                    "\u94EC\u9EC4",
                                    "\u91D1\u8272",
                                    "\u67E0\u6AAC\u7EF8\u8272",
                                    "\u4EAE\u5361\u5176\u8272",
                                    "\u7070\u91D1\u83CA\u8272",
                                    "\u6697\u5361\u5176\u8272",
                                    "\u542B\u7F9E\u8349\u9EC4",
                                    "\u5976\u6CB9\u8272",
                                    "\u8C61\u7259\u8272",
                                    "\u7C73\u9EC4\u8272",
                                    "\u4EAE\u9EC4",
                                    "\u4EAE\u91D1\u83CA\u9EC4",
                                    "\u9999\u69DF\u9EC4",
                                    "\u82A5\u672B\u9EC4",
                                    "\u6708\u9EC4",
                                    "\u6A44\u6984\u8272",
                                    "\u9C9C\u9EC4",
                                    "\u9EC4\u8272",
                                    "\u82D4\u85D3\u7EFF",
                                    "\u4EAE\u67E0\u6AAC\u7EFF",
                                    "\u6A44\u6984\u519B\u670D\u7EFF",
                                    "\u9EC4\u7EFF",
                                    "\u6697\u6A44\u6984\u7EFF",
                                    "\u82F9\u679C\u7EFF",
                                    "\u7EFF\u9EC4",
                                    "\u8349\u7EFF",
                                    "\u8349\u576A\u7EFF",
                                    "\u67E5\u7279\u9152\u7EFF",
                                    "\u53F6\u7EFF",
                                    "\u5AE9\u7EFF",
                                    "\u660E\u7EFF",
                                    "\u94B4\u7EFF",
                                    "\u871C\u74DC\u7EFF",
                                    "\u6697\u6D77\u7EFF",
                                    "\u4EAE\u7EFF",
                                    "\u7070\u7EFF",
                                    "\u5E38\u6625\u85E4\u7EFF",
                                    "\u68EE\u6797\u7EFF",
                                    "\u67E0\u6AAC\u7EFF",
                                    "\u6697\u7EFF",
                                    "\u7EFF\u8272",
                                    "\u9C9C\u7EFF\u8272",
                                    "\u5B54\u96C0\u77F3\u7EFF",
                                    "\u8584\u8377\u7EFF",
                                    "\u9752\u74F7\u7EFF",
                                    "\u78A7\u7EFF",
                                    "\u7EFF\u677E\u77F3\u7EFF",
                                    "\u94EC\u7EFF",
                                    "\u82CD\u8272",
                                    "\u6D77\u7EFF",
                                    "\u4E2D\u6D77\u7EFF",
                                    "\u8584\u8377\u5976\u6CB9\u8272",
                                    "\u6625\u7EFF",
                                    "\u5B54\u96C0\u7EFF",
                                    "\u4E2D\u6625\u7EFF\u8272",
                                    "\u4E2D\u78A7\u84DD\u8272",
                                    "\u78A7\u84DD\u8272",
                                    "\u9752\u84DD",
                                    "\u6C34\u84DD",
                                    "\u7EFF\u677E\u77F3\u84DD",
                                    "\u7EFF\u677E\u77F3\u8272",
                                    "\u4EAE\u6D77\u7EFF",
                                    "\u4E2D\u7EFF\u677E\u77F3\u8272",
                                    "\u4EAE\u9752",
                                    "\u6D45\u84DD",
                                    "\u7070\u7EFF\u677E\u77F3\u8272",
                                    "\u6697\u5CA9\u7070",
                                    "\u51EB\u7EFF",
                                    "\u6697\u9752",
                                    "\u9752\u8272",
                                    "\u6C34\u8272",
                                    "\u6697\u7EFF\u677E\u77F3\u8272",
                                    "\u519B\u670D\u84DD",
                                    "\u5B54\u96C0\u84DD",
                                    "\u5A74\u513F\u7C89\u84DD",
                                    "\u6D53\u84DD",
                                    "\u4EAE\u84DD",
                                    "\u7070\u84DD",
                                    "\u8428\u514B\u65AF\u84DD",
                                    "\u6DF1\u5929\u84DD",
                                    "\u5929\u84DD",
                                    "\u4EAE\u5929\u84DD",
                                    "\u6C34\u624B\u84DD",
                                    "\u666E\u9C81\u58EB\u84DD",
                                    "\u94A2\u9752\u8272",
                                    "\u7231\u4E3D\u4E1D\u84DD",
                                    "\u5CA9\u7070",
                                    "\u4EAE\u5CA9\u7070",
                                    "\u9053\u5947\u84DD",
                                    "\u77FF\u84DD",
                                    "\u6E5B\u84DD",
                                    "\u97E6\u5947\u4F0D\u5FB7\u74F7\u84DD",
                                    "\u4EAE\u94A2\u84DD",
                                    "\u94B4\u84DD",
                                    "\u7070\u4E01\u5B81\u84DD",
                                    "\u77E2\u8F66\u83CA\u84DD",
                                    "\u9F20\u5C3E\u8349\u84DD",
                                    "\u6697\u5A74\u513F\u7C89\u84DD",
                                    "\u84DD\u5B9D\u77F3\u8272",
                                    "\u56FD\u9645\u5947\u8FDE\u84DD",
                                    "\u851A\u84DD",
                                    "\u54C1\u84DD",
                                    "\u6697\u77FF\u84DD",
                                    "\u6781\u6D53\u6D77\u84DD",
                                    "\u5929\u9752\u77F3\u84DD",
                                    "\u5E7D\u7075\u767D",
                                    "\u85B0\u8863\u8349\u7D2B",
                                    "\u957F\u6625\u82B1\u8272",
                                    "\u5348\u591C\u84DD",
                                    "\u85CF\u9752",
                                    "\u6697\u84DD",
                                    "\u4E2D\u84DD",
                                    "\u84DD\u8272",
                                    "\u7D2B\u85E4\u8272",
                                    "\u6697\u5CA9\u84DD",
                                    "\u5CA9\u84DD",
                                    "\u4E2D\u5CA9\u84DD",
                                    "\u6728\u69FF\u7D2B",
                                    "\u7D2B\u4E01\u9999\u8272",
                                    "\u4E2D\u7D2B\u7EA2",
                                    "\u7D2B\u6C34\u6676\u8272",
                                    "\u6D45\u7070\u7D2B\u7EA2",
                                    "\u7F2C\u8349\u7D2B",
                                    "\u77FF\u7D2B",
                                    "\u84DD\u7D2B",
                                    "\u7D2B\u7F57\u5170\u8272",
                                    "\u975B\u8272",
                                    "\u6697\u5170\u7D2B",
                                    "\u6697\u7D2B",
                                    "\u4E09\u8272\u5807\u7D2B",
                                    "\u9526\u8475\u7D2B",
                                    "\u4F18\u54C1\u7D2B\u7EA2",
                                    "\u4E2D\u5170\u7D2B",
                                    "\u6DE1\u7D2B\u4E01\u9999\u8272",
                                    "\u84DF\u7D2B",
                                    "\u94C1\u7EBF\u83B2\u7D2B",
                                    "\u6885\u7EA2\u8272",
                                    "\u4EAE\u7D2B",
                                    "\u7D2B\u8272",
                                    "\u6697\u6D0B\u7EA2",
                                    "\u6D0B\u7EA2",
                                    "\u54C1\u7EA2",
                                    "\u5170\u7D2B",
                                    "\u6D45\u73CD\u73E0\u7EA2",
                                    "\u9648\u73AB\u7EA2",
                                    "\u6D45\u73AB\u7470\u7EA2",
                                    "\u4E2D\u9752\u7D2B\u7EA2",
                                    "\u6D0B\u73AB\u7470\u7EA2",
                                    "\u73AB\u7470\u7EA2",
                                    "\u7EA2\u5B9D\u77F3\u8272",
                                    "\u5C71\u8336\u7EA2",
                                    "\u6DF1\u7C89\u7EA2",
                                    "\u706B\u9E64\u7EA2",
                                    "\u6D45\u73CA\u745A\u7EA2",
                                    "\u6696\u7C89\u7EA2",
                                    "\u52C3\u6839\u7B2C\u9152\u7EA2",
                                    "\u5C16\u6676\u77F3\u7EA2",
                                    "\u80ED\u8102\u7EA2",
                                    "\u6D45\u7C89\u7EA2",
                                    "\u67A2\u673A\u7EA2",
                                    "\u85B0\u8863\u8349\u7D2B\u7EA2",
                                    "\u7070\u7D2B\u7EA2",
                                    "\u6A31\u6843\u7EA2",
                                    "\u6D45\u9C91\u7EA2",
                                    "\u7EEF\u7EA2",
                                    "\u7C89\u7EA2",
                                    "\u4EAE\u7C89\u7EA2",
                                    "\u58F3\u9EC4\u7EA2",
                                    "\u831C\u7EA2");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\zh_CN\\Color")
                    .setLookup(
                            Color.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("allColorNames", "safeColorNames")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/zh_CN/Color.php")
                    .addExtendsClass("Faker\\Provider\\Color")
                    .addExtendsClass("Faker\\Provider\\Base")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}

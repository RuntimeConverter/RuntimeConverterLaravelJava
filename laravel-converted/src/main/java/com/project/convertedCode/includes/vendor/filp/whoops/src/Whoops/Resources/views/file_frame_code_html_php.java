package com.project.convertedCode.includes.vendor.filp.whoops.src.Whoops.Resources.views;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_extract;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/filp/whoops/src/Whoops/Resources/views/frame_code.html.php

*/

public class file_frame_code_html_php implements RuntimeIncludable {

    public static final file_frame_code_html_php instance = new file_frame_code_html_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope335 scope = new Scope335();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope335 scope)
            throws IncludeEventException {

        env.echo("<div class=\"frame-code-container ");
        env.echo(!ZVal.isTrue(scope.has_frames) ? "empty" : "");
        env.echo("\">\n  ");
        for (ZPair zpairResult55 : ZVal.getIterable(scope.frames, env, false)) {
            scope.i = ZVal.assign(zpairResult55.getKey());
            scope.frame = ZVal.assign(zpairResult55.getValue());

            env.echo("    ");
            scope.line = env.callMethod(scope.frame, "getLine", file_frame_code_html_php.class);

            env.echo("      <div class=\"frame-code ");
            env.echo(ZVal.equalityCheck(scope.i, 0) ? "active" : "");
            env.echo("\" id=\"frame-code-");
            env.echo(scope.i);
            env.echo("\">\n        <div class=\"frame-file\">\n          ");
            scope.filePath = env.callMethod(scope.frame, "getFile", file_frame_code_html_php.class);

            env.echo("          ");
            if (ZVal.toBool(scope.filePath)
                    && ZVal.toBool(
                            scope.editorHref =
                                    env.callMethod(
                                            scope.handler,
                                            "getEditorHref",
                                            file_frame_code_html_php.class,
                                            scope.filePath,
                                            ZVal.toLong(scope.line)))) {

                env.echo("            Open:\n            <a href=\"");
                env.echo(scope.editorHref);
                env.echo("\" class=\"editor-link\"");
                env.echo(
                        ZVal.isTrue(
                                        env.callMethod(
                                                scope.handler,
                                                "getEditorAjax",
                                                file_frame_code_html_php.class,
                                                scope.filePath,
                                                ZVal.toLong(scope.line)))
                                ? " data-ajax"
                                : "");
                env.echo(">\n              <strong>");
                env.echo(
                        env.callMethod(
                                scope.tpl,
                                "breakOnDelimiter",
                                file_frame_code_html_php.class,
                                "/",
                                env.callMethod(
                                        scope.tpl,
                                        "escape",
                                        file_frame_code_html_php.class,
                                        ZVal.isTrue(scope.ternaryExpressionTemp = scope.filePath)
                                                ? scope.ternaryExpressionTemp
                                                : "<#unknown>")));
                env.echo("</strong>\n            </a>\n          ");

            } else {

                env.echo("            <strong>");
                env.echo(
                        env.callMethod(
                                scope.tpl,
                                "breakOnDelimiter",
                                file_frame_code_html_php.class,
                                "/",
                                env.callMethod(
                                        scope.tpl,
                                        "escape",
                                        file_frame_code_html_php.class,
                                        ZVal.isTrue(scope.ternaryExpressionTemp = scope.filePath)
                                                ? scope.ternaryExpressionTemp
                                                : "<#unknown>")));
                env.echo("</strong>\n          ");
            }

            env.echo("        </div>\n        ");
            if (ZVal.strictNotEqualityCheck(scope.line, "!==", ZVal.getNull())) {
                scope.range =
                        env.callMethod(
                                scope.frame,
                                "getFileLines",
                                file_frame_code_html_php.class,
                                ZVal.subtract(scope.line, 20),
                                40);
                if (ZVal.isTrue(scope.range)) {
                    scope.range =
                            function_array_map
                                    .f
                                    .env(env)
                                    .call(
                                            new Closure(
                                                    env,
                                                    this.getContextConstants(),
                                                    "",
                                                    stack.get("this")) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "line")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object line = assignParameter(args, 0, false);
                                                    return ZVal.assign(
                                                            ZVal.isEmpty(line) ? " " : line);
                                                }
                                            },
                                            scope.range)
                                    .value();
                    scope.start = ZVal.add(function_key.f.env(env).call(scope.range).value(), 1);
                    scope.code = NamespaceGlobal.join.env(env).call("\n", scope.range).value();

                    env.echo("            <pre id=\"frame-code-linenums-");
                    env.echo(scope.i);
                    env.echo("\" class=\"code-block linenums:");
                    env.echo(scope.start);
                    env.echo("\">");
                    env.echo(
                            env.callMethod(
                                    scope.tpl,
                                    "escape",
                                    file_frame_code_html_php.class,
                                    scope.code));
                    env.echo("</pre>\n\n          ");
                }

                env.echo("        ");
            }

            env.echo("\n        ");
            scope.frameArgs =
                    env.callMethod(
                            scope.tpl, "dumpArgs", file_frame_code_html_php.class, scope.frame);

            env.echo("        ");
            if (ZVal.isTrue(scope.frameArgs)) {

                env.echo(
                        "          <div class=\"frame-file\">\n              Arguments\n          </div>\n          <div id=\"frame-code-args-");
                env.echo(scope.i);
                env.echo("\" class=\"code-block frame-args\">\n              ");
                env.echo(scope.frameArgs);

                env.echo("          </div>\n        ");
            }

            env.echo("\n        ");
            scope.comments =
                    env.callMethod(scope.frame, "getComments", file_frame_code_html_php.class);

            env.echo("        <div class=\"frame-comments ");
            env.echo(ZVal.isEmpty(scope.comments) ? "empty" : "");
            env.echo("\">\n          ");
            for (ZPair zpairResult56 : ZVal.getIterable(scope.comments, env, false)) {
                scope.commentNo = ZVal.assign(zpairResult56.getKey());
                scope.comment = ZVal.assign(zpairResult56.getValue());

                env.echo("            ");
                function_extract.f.env(env).call(stack, scope.comment);
                env.echo("            <div class=\"frame-comment\" id=\"comment-");
                env.echo(toStringR(scope.i, env) + "-" + toStringR(scope.commentNo, env));
                env.echo("\">\n              <span class=\"frame-comment-context\">");
                env.echo(
                        env.callMethod(
                                scope.tpl,
                                "escape",
                                file_frame_code_html_php.class,
                                scope.context));
                env.echo("</span>\n              ");
                env.echo(
                        env.callMethod(
                                scope.tpl,
                                "escapeButPreserveUris",
                                file_frame_code_html_php.class,
                                scope.comment));
                env.echo("            </div>\n          ");
            }

            env.echo("        </div>\n\n      </div>\n  ");
        }

        env.echo("</div>\n");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/filp/whoops/src/Whoops/Resources/views")
                    .setFile("/vendor/filp/whoops/src/Whoops/Resources/views/frame_code.html.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope335 implements UpdateRuntimeScopeInterface {

        Object handler;
        Object code;
        Object comments;
        Object commentNo;
        Object frames;
        Object line;
        Object filePath;
        Object start;
        Object i;
        Object range;
        Object ternaryExpressionTemp;
        Object editorHref;
        Object tpl;
        Object has_frames;
        Object context;
        Object comment;
        Object frame;
        Object frameArgs;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("handler", this.handler);
            stack.setVariable("code", this.code);
            stack.setVariable("comments", this.comments);
            stack.setVariable("commentNo", this.commentNo);
            stack.setVariable("frames", this.frames);
            stack.setVariable("line", this.line);
            stack.setVariable("filePath", this.filePath);
            stack.setVariable("start", this.start);
            stack.setVariable("i", this.i);
            stack.setVariable("range", this.range);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("editorHref", this.editorHref);
            stack.setVariable("tpl", this.tpl);
            stack.setVariable("has_frames", this.has_frames);
            stack.setVariable("context", this.context);
            stack.setVariable("comment", this.comment);
            stack.setVariable("frame", this.frame);
            stack.setVariable("frameArgs", this.frameArgs);
        }

        public void updateScope(RuntimeStack stack) {

            this.handler = stack.getVariable("handler");
            this.code = stack.getVariable("code");
            this.comments = stack.getVariable("comments");
            this.commentNo = stack.getVariable("commentNo");
            this.frames = stack.getVariable("frames");
            this.line = stack.getVariable("line");
            this.filePath = stack.getVariable("filePath");
            this.start = stack.getVariable("start");
            this.i = stack.getVariable("i");
            this.range = stack.getVariable("range");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.editorHref = stack.getVariable("editorHref");
            this.tpl = stack.getVariable("tpl");
            this.has_frames = stack.getVariable("has_frames");
            this.context = stack.getVariable("context");
            this.comment = stack.getVariable("comment");
            this.frame = stack.getVariable("frame");
            this.frameArgs = stack.getVariable("frameArgs");
        }
    }

    private static class Scope75 implements UpdateRuntimeScopeInterface {

        Object handler;
        Object code;
        Object comments;
        Object commentNo;
        Object frames;
        Object line;
        Object filePath;
        Object start;
        Object i;
        Object range;
        Object ternaryExpressionTemp;
        Object editorHref;
        Object tpl;
        Object has_frames;
        Object context;
        Object comment;
        Object frame;
        Object frameArgs;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("handler", this.handler);
            stack.setVariable("code", this.code);
            stack.setVariable("comments", this.comments);
            stack.setVariable("commentNo", this.commentNo);
            stack.setVariable("frames", this.frames);
            stack.setVariable("line", this.line);
            stack.setVariable("filePath", this.filePath);
            stack.setVariable("start", this.start);
            stack.setVariable("i", this.i);
            stack.setVariable("range", this.range);
            stack.setVariable("ternaryExpressionTemp", this.ternaryExpressionTemp);
            stack.setVariable("editorHref", this.editorHref);
            stack.setVariable("tpl", this.tpl);
            stack.setVariable("has_frames", this.has_frames);
            stack.setVariable("context", this.context);
            stack.setVariable("comment", this.comment);
            stack.setVariable("frame", this.frame);
            stack.setVariable("frameArgs", this.frameArgs);
        }

        public void updateScope(RuntimeStack stack) {

            this.handler = stack.getVariable("handler");
            this.code = stack.getVariable("code");
            this.comments = stack.getVariable("comments");
            this.commentNo = stack.getVariable("commentNo");
            this.frames = stack.getVariable("frames");
            this.line = stack.getVariable("line");
            this.filePath = stack.getVariable("filePath");
            this.start = stack.getVariable("start");
            this.i = stack.getVariable("i");
            this.range = stack.getVariable("range");
            this.ternaryExpressionTemp = stack.getVariable("ternaryExpressionTemp");
            this.editorHref = stack.getVariable("editorHref");
            this.tpl = stack.getVariable("tpl");
            this.has_frames = stack.getVariable("has_frames");
            this.context = stack.getVariable("context");
            this.comment = stack.getVariable("comment");
            this.frame = stack.getVariable("frame");
            this.frameArgs = stack.getVariable("frameArgs");
        }
    }
}

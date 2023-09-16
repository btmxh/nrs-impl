/* @jsx x */
import { h, renderSSR } from "https://deno.land/x/nano_jsx@v0.1.0/mod.ts";
import {
  createXMLHandler,
  xml,
  createXMLRenderer,
} from "https://deno.land/x/xml4jsx@1.0.0/mod.ts";

const x = createXMLHandler(h);

function WTF() {
  return (
    <doc>
      <title>idk chat</title>
    </doc>
  );
}

const renderer = createXMLRenderer(renderSSR);
console.debug(renderer(<WTF />));

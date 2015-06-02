<#list BookList as BookData>
	<div>
		${BookData.author}.(
		<#if BookData.month??>
			${BookData.month}-
		</#if>
		${BookData.year}).
		<em>${BookData.title}.</em>
		<#if BookData.address??>
			${BookData.address}:
		</#if>
		${BookData.publisher}.
		<#if BookData.volume??>
			(${BookData.volume}).
		</#if>
		<#if BookData.number??>
			<em>${BookData.number}</em>.
		</#if>
		<#if BookData.crossref??>
			References: ${BookData.crossref}
		</#if>
	</div>
</#list>
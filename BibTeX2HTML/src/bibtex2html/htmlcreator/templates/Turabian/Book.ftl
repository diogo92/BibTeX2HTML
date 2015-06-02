<#list BookList as BookData>
	<div>
		${BookData.author}.
		<em>${BookData.title}.</em>
		<#if BookData.address??>
			${BookData.address}:
		</#if>
		${BookData.publisher},
		${BookData.year}.
		<#if BookData.note??>
			${BookData.note}.
		</#if>
		<#if BookData.crossref??>
			References: ${BookData.crossref}
		</#if>
	</div>
</#list>
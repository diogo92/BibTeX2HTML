<#list BookList as BookData>
	<div>
		${BookData.author}.
		<em>${BookData.title}.</em>
		<#if BookData.address??>
			${BookData.address}:
		</#if>
		${BookData.publisher},
		<#if BookData.month??>
			${BookData.month}-
		</#if>
		${BookData.year}.
		<#if BookData.crossref??>
			References: ${BookData.crossref}
		</#if>
	</div>
</#list>
<#list ArticleList as ArticleData>
	<div>
		${ArticleData.author}.(
		<#if ArticleData.month??>
			${ArticleData.month}-
		</#if>
		${ArticleData.year}).
		${ArticleData.title}.
		<em>${ArticleData.journal}</em>
		<#if ArticleData.volume??>,
			<em>${ArticleData.volume}</em>
		</#if>
		<#if ArticleData.number??>
			(${ArticleData.number})
		</#if>
		<#if ArticleData.pages??>
			,${ArticleData.pages}
		</#if>.
		<#if ArticleData.note??>
			note: {ArticleData.note}.
		</#if>
		<#if ArticleData.key??>
			doi: ${ArticleData.key}.
		</#if>
		<#if ArticleData.crossref??>
			References: ${ArticleData.crossref}.
		</#if>	
	</div>
</#list>